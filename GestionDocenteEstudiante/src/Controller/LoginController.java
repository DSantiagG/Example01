/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Hamilton Jojoa
 */
public class LoginController {
    
    public boolean isUserValid(String idUser, String password){
        String user = "hamilton";
        String pass = "123456";
        return idUser.equals(user) && password.equals(pass);
        }
    
}
