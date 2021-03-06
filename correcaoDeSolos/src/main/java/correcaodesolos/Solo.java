/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcaodesolos;

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
   
    private double fosforo; //valor de análise de fósforo no solo
    private double potassio; //valor de análise de potássio no solo
    private double calcio; //valor de análise de cálcio no solo
    private double magnesio; //valor de análise de magnésio no solo
    private double enxofre; //valor de análise de enxofre no solo
    private double aluminio; //valor de análise de alumínio no solo
    private double HAL; //valor de análise de H+AL no solo
    
    private CorrecaoFosforo correcaoFosforo;
    private CorrecaoPotassio correcaoPotassio;
    private CorrecaoCalcioMagnesio correcaoCalcioMagnesio;
    
    
    // métoodos construtores
    public Solo() {
    }

    public Solo(double areaTotal, int talhao, double areaTalhao, int textura, int sistemaCultivo, int profundidade, int numeroResultado, Date data, int lote, int matriculaLote, double fosforo, double potassio, double calcio, double magnesio, double enxofre, double aluminio, double HAL, CorrecaoFosforo correcaoFosforo, CorrecaoPotassio correcaoPotassio, CorrecaoCalcioMagnesio correcaoCalcioMagnesio  ) {
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
        this.fosforo = fosforo;
        this.potassio = potassio;
        this.calcio = calcio;
        this.magnesio = magnesio;
        this.enxofre = enxofre;
        this.aluminio = aluminio;
        this.HAL = HAL;
        this.correcaoFosforo = correcaoFosforo;
        this.correcaoPotassio = correcaoPotassio;
        this.correcaoCalcioMagnesio = correcaoCalcioMagnesio;
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
    
    public double getFosforo() {
        return fosforo;
    }
    
    public double getPotassio() {
        return potassio;
    }
    
    public double getCalcio() {
        return calcio;
    }
    
    public double getMagnesio() {
        return magnesio;
    }
    
    public double getEnxofre() {
        return enxofre;
    }
    
    public double getAluminio() {
        return aluminio;
    }
    
    public double getHAL() {
        return HAL;
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
    
    public void setFosforo(double fosforo) {
        this.fosforo = fosforo;
    }
    
    public void setPotassio(double potassio) {
        this.potassio = potassio;
    }
    
    public void setCalcio(double calcio) {
        this.calcio = calcio;
    }
    
    public void setMagnesio(double magnesio) {
        this.magnesio = magnesio;
    }
    
    public void setEnxofre(double enxofre) {
        this.enxofre = enxofre;
    }
    
    public void setAluminio(double aluminio) {
        this.aluminio = aluminio;
    }
    
    public void setHAL(double HAL) {
        this.HAL = HAL;
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
    
    public double getScmol(){
        double soma;
        soma = this.calcio + this.magnesio + this.potassio;
        
        if(soma > 0.01){
            return soma;
        }
        else{
            return -1;
        }
        
    }
    
    public double getCTCcmol(){
        double soma;
        soma = this.calcio + this.magnesio + this.potassio + this.HAL;
        
        if(soma > 0.01){
            return soma;
        }
        
        else{
            return -1;
        }
    }
    
    public double getVatual(){
        return 100*this.getScmol()/this.getCTCcmol();
    }
}
