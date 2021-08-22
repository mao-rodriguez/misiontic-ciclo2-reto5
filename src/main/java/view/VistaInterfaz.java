package view;

import controller.Controlador;

import model.vo.LiderVo;
import model.vo.ConstructoraVo;
import model.vo.LiderApellidoVo;


import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
//import javax.swing.AbstractButton;

public class VistaInterfaz extends JFrame {


    public static final Controlador controlador = new Controlador();
    private JPanel contentPane;
    private JTextArea txtArea;

    public VistaInterfaz(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(550, 300, 900, 700);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTitulo = new JLabel("Misión TIC 2022 Ciclo 2 Reto 5");
        lblTitulo.setBounds(28, 6, 61, 6);
        contentPane.add(lblTitulo);

        JLabel lblautor = new JLabel("Mauricio Rodríguez Rivera");
        lblTitulo.setBounds(28, 34, 208, 16);
        contentPane.add(lblautor);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(28, 70, 737, 455);
        contentPane.add(scrollPane);

        txtArea = new JTextArea();
        scrollPane.setViewportView(txtArea);

        // Botón Para requerimiento1
        JButton btnRequerimiento1 = new JButton("Requerimiento 1");
        btnRequerimiento1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                requerimiento1();
            }
        });
            btnRequerimiento1.setBounds(28, 537, 150, 31);
            contentPane.add(btnRequerimiento1);

        // Botón Para requerimiento1
        JButton btnRequerimiento2 = new JButton("Requerimiento 2");
        btnRequerimiento2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                requerimiento2();
            }
        });
        btnRequerimiento2.setBounds(200, 537, 150, 31);
            contentPane.add(btnRequerimiento2);

        // Botón Para requerimiento3
        JButton btnRequerimiento3 = new JButton("Requerimiento 3");
        btnRequerimiento3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                requerimiento3();
            }
        });
        btnRequerimiento3.setBounds(372, 537, 150, 31);
            contentPane.add(btnRequerimiento3);
        
        // Botón para limpiar ventana
        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                txtArea.setText("");
            }
        });
        btnLimpiar.setBounds(550, 537, 150, 31);
            contentPane.add(btnLimpiar);
    }
    
    private void requerimiento1(){
        try{
            ArrayList<LiderVo> listaConsulta = controlador.consultarRequerimiento_1();
            String tabla = "\t\t*** Lideres por Salario ***\n\n\tID\tNOMBRE\tAPELLIDO\tSALARIO\n\n\n";
            for (LiderVo requerimiento1 : listaConsulta) {
                tabla += "\t";
                tabla += requerimiento1.getNombre();
                tabla += "\t";
                tabla += requerimiento1.getPrimer_apellido();
                tabla += "\t";
                tabla += requerimiento1.getId_lider();
                tabla += "\t";
                tabla += (int)requerimiento1.getSalario();
                tabla += "\n";
            };
            txtArea.setText(tabla);
        }
        catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    public void requerimiento2(){
        try{
            ArrayList<ConstructoraVo> listaConsulta = controlador.consultarRequerimiento_2();
            String tabla = "\t\t*** Proyectos por Tipo ***\n\n\tID\tCONSTRUCTORA\tCIUDAD\tESTRATO\n\n\n";
            for (ConstructoraVo requerimiento2 : listaConsulta) {
                tabla += "\t";
                tabla += requerimiento2.getId_proyecto();
                tabla += "\t";
                tabla += requerimiento2.getConstructora();
                tabla += "\t";
                tabla += requerimiento2.getCiudad();
                tabla += "\t";
                tabla += requerimiento2.getEstrato();
                tabla += "\n";
            };
                txtArea.setText(tabla);
        }
        catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    public void requerimiento3(){
        try{
            ArrayList<LiderApellidoVo> listaConsulta = controlador.consultarRequerimiento_3();
            String tabla = "\t\t*** Lideres por Nombre ***\n\n\tID\tNOMBRE\tAPELLIDO\n\n\n";

            for (LiderApellidoVo requerimiento3 : listaConsulta) {
                tabla += "\t";
                tabla += requerimiento3.getId_lider();
                tabla += "\t";
                tabla += requerimiento3.getNombre();
                tabla += "\t";
                tabla += requerimiento3.getPrimer_apellido();
                tabla += "\n";
            }
                txtArea.setText(tabla);

        } catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }
}
