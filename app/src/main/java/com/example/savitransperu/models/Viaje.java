package com.example.savitransperu.models;

public class Viaje {
    private int id;
    private String origen;
    private String destino;
    private String PuntoEmbarque;
    private int CantidadAsientos;
    private double PrecioAsientoNormal;
    private double precioAsientoVip;
    private String diaSalida;
    private String horaSalida;
    private String imgUrl;
    private int img;

    public Viaje(int id, String origen, String destino, String PuntoEmbarque, int CantidadAsientos, double PrecioAsientoNormal, double precioAsientoVip, String diaSalida, String horaSalida,String imgUrl, int img) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.PuntoEmbarque = PuntoEmbarque;
        this.CantidadAsientos = CantidadAsientos;
        this.PrecioAsientoNormal = PrecioAsientoNormal;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
        return PuntoEmbarque;
    }

    public void setPuntoEmbarque(String puntoEmbarque) {
        this.PuntoEmbarque = puntoEmbarque;
    }

    public int getCantidadAsientos() {
        return CantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.CantidadAsientos = cantidadAsientos;
    }

    public double getPrecioAsientoNormal() {
        return PrecioAsientoNormal;
    }

    public void setPrecioAsientoNormal(double precioAsientoNormal) {
        this.PrecioAsientoNormal = precioAsientoNormal;
    }

    public double getPrecioAsientoVip() {
        return precioAsientoVip;
    }

    public void setPrecioAsientoVip(double precioAsientoVip) {
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
