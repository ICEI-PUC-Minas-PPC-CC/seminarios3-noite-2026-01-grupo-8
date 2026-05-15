package com.example.demo;

import org.springframework.lang.NonNull;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TranscreveHandler extends TextWebSocketHandler {

    private static final Set<WebSocketSession> sessoes = Collections.synchronizedSet(new HashSet<>());

    @Override
    public void afterConnectionEstablished(@NonNull WebSocketSession session) throws Exception {
        sessoes.add(session);
    }

    @Override
    protected void handleTextMessage(@NonNull WebSocketSession session, @NonNull TextMessage message) throws Exception {
        for (WebSocketSession s : sessoes) {
            if (s.isOpen()) {
                s.sendMessage(new TextMessage(message.getPayload()));
            }
        }
    }

    @SuppressWarnings("null")
    @Override
    public void afterConnectionClosed(@NonNull WebSocketSession session, org.springframework.web.socket.CloseStatus status) throws Exception {
        sessoes.remove(session);
    }
}