/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arcardium.model.enums;

import java.util.Random;

/**
 *
 * @author Luísa
 */
public enum TagMagia {
 //  ESPECIAIS?
    SORTE, CHEFE,

 //  ELEMENTOS:
    FOGO, GELO, RAIO, SOMBRA, LUZ, NATUREZA, ARCANA,
 //  TIPO DE AÇÃO:
    DANO, CURA, BUFF, DEBUFF, CONTROLE,
 //  ESCOPO:
    ALVO_UNICO, AREA,
 //  EFEITOS:
    VENENO, MALDIÇÃO, SANGRAMENTO;
    
    
   

    @Override
    public String toString() {
        return "[" + name() + "]";
    }
    
   
}
