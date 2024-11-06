package br.com.loja.assistec.controller;

import br.com.loja.assistec.view.PrincipalView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrincipalController {

    private PrincipalView view;
    private String usuario;
    private String perfil;

    public PrincipalController(String usuario, String perfil) {
        this.usuario = usuario;
        this.perfil = perfil;
        this.view = new PrincipalView(usuario, perfil);
        configurarListeners();
        this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
    }

    private void configurarListeners() {
        view.addMenuListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String actionCommand = e.getActionCommand();
                if ("MenuSairAction".equals(actionCommand)) {
                    sair();
                } else if ("MenuSobreAction".equals(actionCommand)) {
                    sobre();
                }
        }});

    }

    private void sair() {
        int sair = JOptionPane.showConfirmDialog(view,
                "Tem certeza que deseja sair?",
                "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == 0) {
            System.exit(0);
        }
    }

    private void sobre() {
        JOptionPane.showMessageDialog(view,
                "Sistema de Gestão ASSISTEC - Versão 1.0",
                "Sobre", JOptionPane.INFORMATION_MESSAGE);
    }

    /*private void listarUsuarios() {
        ListarUsuariosView listarUsuariosView = new ListarUsuariosView();
        listarUsuariosView.setLocationRelativeTo(view);
        listarUsuariosView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        listarUsuariosView.setVisible(true);
    }*/
}
