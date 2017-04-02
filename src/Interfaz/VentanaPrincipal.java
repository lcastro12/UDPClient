package Interfaz;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;


public class VentanaPrincipal extends JFrame {
	
	
	 public VentanaPrincipal( )
	    {
	        setLayout( new GridLayout(2,1 ) );

	        PanelConexion panelConexion = new PanelConexion( this );
	        add( panelConexion);
	        PanelDescarga panelDescarga = new PanelDescarga( this );
	        add(panelDescarga);
	       

	      

	        pack( );
	        setTitle( "Interfaz Cliente" );
	        setResizable( true );
	        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

	    }

	
	public static void main( String[] args )
    {
        try
        {
            UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName( ) );
        }
        catch( Exception e )
        {
            //Ignora el look & feel
        }
        VentanaPrincipal i = new VentanaPrincipal( );
        i.setVisible( true );
    }

}
