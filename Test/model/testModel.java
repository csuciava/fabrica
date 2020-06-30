package model;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class testModel {
        private Model M;
        private int cmc;

        @BeforeEach
        void setUp() {
                M = new Model("Sandero");
                cmc = 900;
        }

        @Nested
        @DisplayName("When we add a new model ")
        class addModel {

                @Test
                @DisplayName("Then you can get the model name")
                void getName() {
                        assertEquals("Sandero", M.getName());
                }

                @Test
                @DisplayName("Then you can add a new motorisation")
                void addMotorisation() {
                        assertEquals(true, M.addMotorisation(900));
                        assertEquals(true, M.addMotorisation(1200));
                        assertEquals(2, M.getMotorisationList().size());
                }

                @Test
                @DisplayName("Then you can add a new engine type")
                void addEngineType() {
                        assertEquals(true, M.addEngineType("Diesel"));
                        assertEquals(true, M.addEngineType("Petrol"));
                        assertEquals(2, M.getEngineList().size());
                }
        }
}
