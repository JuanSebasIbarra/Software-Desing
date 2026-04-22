package org.example;

import org.example.notificaciones.model.Notificacion;
import org.example.notificaciones.model.TipoSituacion;
import org.example.notificaciones.model.Usuario;
import org.example.notificaciones.service.GestorNotificaciones;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(
                "u-001",
                "Sebastian",
                "sebastian@example.com",
                "3001234567",
                List.of("device-abc")
        );

        GestorNotificaciones gestor = new GestorNotificaciones();

        Notificacion email = gestor.crearNotificacion(TipoSituacion.INFORMATIVA, "EMAIL", usuario);
        Notificacion sms = gestor.crearNotificacion(TipoSituacion.RECORDATORIO, "SMS", usuario);
        Notificacion app = gestor.crearNotificacion(TipoSituacion.ALERTA, "APP", usuario);

        List<Notificacion> colaEnvio = new ArrayList<>(List.of(email, sms, app));

        for (Notificacion notificacion : colaEnvio) {
            gestor.enviarNotificacion(notificacion);
            System.out.println(notificacion.getCodigo() + " -> " + notificacion.getEstado());
        }

        System.out.println("Historial del usuario: " + gestor.obtenerHistorial(usuario).size());
    }
}

