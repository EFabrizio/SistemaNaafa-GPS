package com.nafaa.util;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class PDFjava extends JFrame{
	
	JButton generarPDF;
	JPanel panelPDF;
	JFileChooser seleccionar_archivo;

	
		public PDFjava(){
			panelPDF= new JPanel();
			seleccionar_archivo = new JFileChooser();
			//editor=new JEditorPane();
			generarPDF = new JButton("Generar TICKET");
			
			
			generarPDF.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
						try{
							
							OutputStream texto_salida=new FileOutputStream
									(new File(System.getProperty("user.home")+"/Desktop/tablas.pdf"));
							Document doc = new Document();
							PdfWriter.getInstance(doc, texto_salida);
							doc.open();
							//Concatena el resultado aqui.
							Image img = Image.getInstance("image/hospital.png");
							img.setAbsolutePosition(250f, 650f);
									
							String variable = "J3J3";
							doc.add(img);
							doc.add(new Paragraph("Hola Mundo! ¿Cómo estas? "+variable));
							doc.add(new Paragraph("¿Bien y tu?"));
							doc.close();
							texto_salida.close();
							JOptionPane.showMessageDialog(null, "PDF correctamente creado");
							
						}catch(Exception ex){
						ex.getStackTrace();
						}
				}
				});
			
			panelPDF.add(generarPDF);
			this.add(panelPDF,BorderLayout.NORTH);
			//this.add(editor,BorderLayout.CENTER);
			this.setSize(300, 400);
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
			
		
			
		}
		
		public static void main(String[] args){
			new PDFjava();
		}
}

