/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcaoSolos;

import java.util.Date;

/**
 *
 * @author Álvaro
 */
public class Solo {
    
    private double areaTotal; // atributo referente a área total(ha)
    private int talhao; // atributo referente ao talhão
    private double areaTalhao; // atributo referente a área do talhão (ha)
    private int textura; // atributo referente a textura. 1 = Argiloso e 2 = Textura Média
    private int sistemaCultivo; // atributo referente ao sistema de cultivo. 1 = Plantio direto e 2 = convencional
    private int profundidade; // atributo referente a área profundidade (cm)
    private int numeroResultado; // atributo referente ao número do resultado da análise de solos
    private Date data; // atributo referente a data
    private int lote; // atributo referente ao lote
    private int matriculaLote; // atributo referente a matrícula do lote

    // métoodos construtores
    public Solo() {
    }

    public Solo(double areaTotal, int talhao, double areaTalhao, int textura, int sistemaCultivo, int profundidade, int numeroResultado, Date data, int lote, int matriculaLote) {
        this.areaTotal = areaTotal;
        this.talhao = talhao;
        this.areaTalhao = areaTalhao;
        this.textura = textura;
        this.sistemaCultivo = sistemaCultivo;
        this.profundidade = profundidade;
        this.numeroResultado = numeroResultado;
        this.data = data;
        this.lote = lote;
        this.matriculaLote = matriculaLote;
    }
    
    // métodos gets
    
    public double getAreaTotal() {
        return areaTotal;
    }

    public int getTalhao() {
        return talhao;
    }

    public double getAreaTalhao() {
        return areaTalhao;
    }

    public int getTextura() {
        return textura;
    }

    public int getSistemaCultivo() {
        return sistemaCultivo;
    }

    public int getProfundidade() {
        return profundidade;
    }

    public int getNumeroResultado() {
        return numeroResultado;
    }

    public Date getData() {
        return data;
    }

    public int getLote() {
        return lote;
    }

    public int getMatriculaLote() {
        return matriculaLote;
    }

    // métodos sets
    
    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public void setTalhao(int talhao) {
        this.talhao = talhao;
    }

    public void setAreaTalhao(double areaTalhao) {
        this.areaTalhao = areaTalhao;
    }

    public void setTextura(int textura) {
        this.textura = textura;
    }

    public void setSistemaCultivo(int sistemaCultivo) {
        this.sistemaCultivo = sistemaCultivo;
    }

    public void setProfundidade(int profundidade) {
        this.profundidade = profundidade;
    }

    public void setNumeroResultado(int numeroResultado) {
        this.numeroResultado = numeroResultado;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public void setMatriculaLote(int matriculaLote) {
        this.matriculaLote = matriculaLote;
    } 
    
    // métodos que calculam os teores ideais
    
    public double getTeorIdealFosforo(){
        if(this.textura == 1){
            return 9;
    }
        else if (this.textura == 2){
            return 12;
        }
        else{
            return -1;
        }
    }
    
    public double getTeorIdealPotassio(){
        if(this.textura == 1){
            return 0.35;
    }
        else if (this.textura == 2){
            return 0.25;
        }
        else{
            return -1;
        }
    }
    
    public double getTeorIdealCalcio(){
        if(this.textura == 1){
            return 6;
    }
        else if (this.textura == 2){
            return 4;
        }
        else{
            return -1;
        }
    }
    
    public double getTeorIdealMagnesio(){
        if(this.textura == 1){
            return 1.5;
    }
        else if (this.textura == 2){
            return 1;
        }
        else{
            return -1;
        }
    }
    
    public double getTeorIdealEnxofre(){
        if(this.textura == 1){
            return 9;
    }
        else if (this.textura == 2){
            return 6;
        }
        else{
            return -1;
        }
    }
    
    public double getTeorIdealAluminio(){
        return 0;
    }
    
}
