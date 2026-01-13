package megalodonte.base;

public interface ScreenComponent {
    ComponentInterface<?> render();
    
    default void onMount() {
        // Implementação vazia - método opcional
    }
}
