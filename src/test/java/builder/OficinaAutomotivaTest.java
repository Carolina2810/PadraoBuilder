package builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OficinaAutomotivaTest {
    @Test
    void deveRetornarExcecaoParaOficinaAutomotivaSemMatricula() {
        try {
            OficinaAutomotivaBuilder oficinaAutomotivaBuilderBuilder = new OficinaAutomotivaBuilder();
            OficinaAutomotiva oficinaAutomotiva = oficinaAutomotivaBuilderBuilder
                    .setNome("Oficina Automotiva 1")
                    .setEmail("oficinaAutomotiva1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Matrícula inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaOficinaAutomotivaSemNome() {
        try {
            OficinaAutomotivaBuilder oficinaAutomotivaBuilder = new OficinaAutomotivaBuilder();
            OficinaAutomotiva oficinaAutomotiva = oficinaAutomotivaBuilder
                    .setMatricula(1)
                    .setEmail("oficinaAutomotiva1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarOficinaAutomotivaValido() {
       OficinaAutomotivaBuilder oficinaAutomotivaBuilder = new OficinaAutomotivaBuilder();
        OficinaAutomotiva oficinaAutomotiva = oficinaAutomotivaBuilder
                .setMatricula(1)
                .setNome("Oficina Automotiva 1")
                .setEmail("oficinaAutomotiva1@email.com")
                .build();

        assertNotNull(oficinaAutomotiva);
    }

}
