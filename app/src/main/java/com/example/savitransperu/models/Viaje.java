package com.example.savitransperu.models;


import android.util.Log;

import java.util.Date;

public class Viaje {
    private int id;
    private String origen;
    private String destino;
    private String PuntoEmbarque;
    private int CantidadAsientos;
    private double PrecioAsientoNormal;
    private double precioAsientoVip;
    private Date FechaSalida;
    private String HoraSalida;
    private String imgUrl;
    private int img;

    public Viaje(int id, String origen, String destino, String PuntoEmbarque, int CantidadAsientos, double PrecioAsientoNormal, double precioAsientoVip, Date FechaSalida, String HoraSalida, String imgUrl, int img) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.PuntoEmbarque = PuntoEmbarque;
        this.CantidadAsientos = CantidadAsientos;
        this.PrecioAsientoNormal = PrecioAsientoNormal;
        this.precioAsientoVip = precioAsientoVip;
        this.FechaSalida = FechaSalida;
        this.HoraSalida = HoraSalida;
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

    public Date getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(Date diaSalida) {
        this.FechaSalida = diaSalida;
    }

    public String getHoraSalida() {
        return HoraSalida;
    }

    public void setHoraSalida(String horaSalida) {
        HoraSalida = horaSalida;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }


}
