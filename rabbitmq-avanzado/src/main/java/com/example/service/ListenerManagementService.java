package com.example.service;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class ListenerManagementService {

    public Object getAllListenerIds() {
        log.info("Obteniendo todos los listeners");
        // Tu lógica aquí
        return null;
    }

    public void pauseListener(String listenerId) {
        log.info("Pausando listener: {}", listenerId);
        // Tu lógica aquí
    }

    public void resumeListener(String listenerId) {
        log.info("Reanudando listener: {}", listenerId);
        // Tu lógica aquí
    }
}