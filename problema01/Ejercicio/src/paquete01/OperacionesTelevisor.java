package paquete01;

import java.util.ArrayList;

public class OperacionesTelevisor {

    private ArrayList<Televisor> lista;
    private double totalPrecio;
    private double tvCaro;

    public void establecerLista(ArrayList<Televisor> l) {
        lista = l;
    }

    public void totalPrecioTvs(ArrayList<Televisor> t) {
        for (int i = 0; i < t.size(); i++) {
            totalPrecio = totalPrecio + t.get(i).obtenerPrecio();
        }
    }

    public void televisorMasCaro(ArrayList<Televisor> t) {
        tvCaro = 0;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).obtenerPrecio() > tvCaro) {
                tvCaro = t.get(i).obtenerPrecio();
            }
        }
    }

    public ArrayList<Televisor> obtenerLista() {
        return lista;
    }

    public double obtenerTotalPrecio() {
        return totalPrecio;
    }

    public double obtenerTelevisorCaro() {
        return tvCaro;
    }

    @Override
    public String toString() {
        String reporte = String.format("---------------------------\n" +
                "Total Precio: %.2f\n" +
                "Televisor Más Caro: %.2f\n" +
                "Lista Marcas Vendidas:\n",
                totalPrecio,
                tvCaro);

        for (int i = 0; i < lista.size(); i++) {
            reporte = String.format("%s%s\n", 
                    reporte, 
                    lista.get(i).obtenerMarca());
        }
        return reporte;
    }

}
