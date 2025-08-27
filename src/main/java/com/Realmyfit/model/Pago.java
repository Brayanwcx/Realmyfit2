package com.Realmyfit.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pagos")
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double monto;           // Valor del pago
    private LocalDate fechaPago;    // Fecha en que se realizó el pago
    private String metodo;          // Ej: Efectivo, Tarjeta, Transferencia

    // 🔹 Constructor vacío
    public Pago() {
    }

    // 🔹 Constructor con parámetros
    public Pago(Long id, double monto, LocalDate fechaPago, String metodo) {
        this.id = id;
        this.monto = monto;
        this.fechaPago = fechaPago;
        this.metodo = metodo;
    }

    // 🔹 Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    // 🔹 toString (opcional)
    @Override
    public String toString() {
        return "Pago{" +
                "id=" + id +
                ", monto=" + monto +
                ", fechaPago=" + fechaPago +
                ", metodo='" + metodo + '\'' +
                '}';
    }
}
