/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guerra.spv.recursos.mensajes;

import com.guerra.spv.recursos.utilerias.NumeroUtil;
import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Jaasiel
 */
public class MsjValidacion {

    private MsjValidacion() {

    }

    /**
     * Muestra un mensaje indicando que el cliente no dispone de credito
     * suficiente
     *
     * @param padre
     * @param creditoDisponible
     */
    public static void msjCreditoInsuficiente(Component padre, Double creditoDisponible) {
        JOptionPane.showMessageDialog(padre, "El cliente no dispone de suficiente crédito para cobrar la venta.\n"
                + "Crédito disponible: " + NumeroUtil.formatearAMoneda(creditoDisponible),
                "Crédito", JOptionPane.WARNING_MESSAGE);
    }

    /**
     * Muestra mensaje indicando que el abono no es valido
     * @param padre
     * @param saldo 
     */
    public static void msjAbonoDeudaInvalido(Component padre, Double saldo) {
        JOptionPane.showMessageDialog(padre, "El abono ingresado es inválido.\n"
                + "Ingrese una cantidad entre " + NumeroUtil.formatearAMoneda(0.00D) + " y " + NumeroUtil.formatearAMoneda(saldo),
                "Crédito", JOptionPane.WARNING_MESSAGE);
    }

    /**
     * Muestra un mensaje en el que indica que ya esta puesto como pendiente
     *
     * @param padre
     */
    public static void msjEstadoYaPendiente(Component padre) {
        JOptionPane.showMessageDialog(padre, "Ya ha sido puesto en PENDIENTE.",
                "Incorrecto", JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Muestra mensaje indicando que el efectivo ingresado no es validao
     *
     * @param padre
     * @param totalCobrar
     */
    public static void msjEfectivoInvalido(Component padre, Double totalCobrar) {
        JOptionPane.showMessageDialog(padre, "El efectivo ingresado no es válido, el total a cobrar es: "
                + NumeroUtil.formatearAMoneda(totalCobrar),
                "Incorrecto", JOptionPane.WARNING_MESSAGE);
    }

    /**
     * Muestra una mensaje de error indicando que no hay se puede realizar la
     * accion debido a que no hay articulo
     *
     * @param padre
     */
    public static void msjTablaVaciaSinArticulos(Component padre) {
        JOptionPane.showMessageDialog(padre, "No se puede realizar la acción, porque no hay artículos en la tabla.",
                "Incorrecto", JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Muestra un mensaje de valicacion para JTextField requeridos
     *
     * @param componentePadre el componente padre del mensaje
     */
    public static void msjJTextFieldRequeridos(Component componentePadre) {
        JOptionPane.showMessageDialog(componentePadre,
                "Los campos requeridos no pueden dejarse vacíos (Requeridos (*)).", "Error de validación",
                JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Muestra mensaje de seleccion de combobox requerida
     *
     * @param componentePadre
     */
    public static void msjJComboBoxdRequeridos(Component componentePadre) {
        JOptionPane.showMessageDialog(componentePadre,
                "Una o más opciones son requeridas y no se han seleccionado (Requeridos (*)).", "Error de validación",
                JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Muestra mensaje de validacion para valor double invalido
     *
     * @param componentePadre
     */
    public static void msjValoresNumericosInvalidos(Component componentePadre) {
        JOptionPane.showMessageDialog(componentePadre,
                "Uno o más valores numéricos son inválidos (Requeridos (*)).", "Error de validación",
                JOptionPane.ERROR_MESSAGE);
    }
}
