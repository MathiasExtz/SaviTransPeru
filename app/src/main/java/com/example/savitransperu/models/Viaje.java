package com.example.savitransperu.models;

public class Viaje {
    private String id;
    private String origen;
    private String destino;
    private String puntoEmbarque;
    private String cantidadAsientos;
    private String precioAsientoNormal;
    private String precioAsientoVip;
    private String diaSalida;
    private String horaSalida;
    private String imgUrl;
    private int img;

    public Viaje(String id, String origen, String destino, String puntoEmbarque, String cantidadAsientos, String precioAsientoNormal, String precioAsientoVip, String diaSalida, String horaSalida,String imgUrl, int img) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.puntoEmbarque = puntoEmbarque;
        this.cantidadAsientos = cantidadAsientos;
        this.precioAsientoNormal = precioAsientoNormal;
        this.precioAsientoVip = precioAsientoVip;
        this.diaSalida = diaSalida;
        this.horaSalida = horaSalida;
        this.setImgUrl(imgUrl);
        this.img = img;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getPuntoEmbarque() {
        return puntoEmbarque;
    }

    public void setPuntoEmbarque(String puntoEmbarque) {
        this.puntoEmbarque = puntoEmbarque;
    }

    public String getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(String cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public String getPrecioAsientoNormal() {
        return precioAsientoNormal;
    }

    public void setPrecioAsientoNormal(String precioAsientoNormal) {
        this.precioAsientoNormal = precioAsientoNormal;
    }

    public String getPrecioAsientoVip() {
        return precioAsientoVip;
    }

    public void setPrecioAsientoVip(String precioAsientoVip) {
        this.precioAsientoVip = precioAsientoVip;
    }

    public String getDiaSalida() {
        return diaSalida;
    }

    public void setDiaSalida(String diaSalida) {
        this.diaSalida = diaSalida;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
