/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tienda.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author shironeko
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    private Integer id;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String status;
    private String foto;
    private String perfil;
    private String password;
    private String usuario;
    
}
