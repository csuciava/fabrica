package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryTest {
    private Factory factory;
    private Model M;

    @BeforeEach
    void setUp() {
        factory = new Factory("one","China");
        M= new Model("Sandero");
        M.addEngineType("benzină");
        M.addMotorisation(900);
    }

    @Nested
    @DisplayName("When we add a new factory ")
    class addFactory {

        @Test
        @DisplayName("Then we can get produced models ")
        void getModelsProduced() {
            assertEquals(true, factory.addProducedModel(M));
            assertEquals(1, factory.getModelsProduced().size());
        }

        @Test
        @DisplayName("Then we can a new produced model")
        void addProducedModel() {
            assertEquals(true, factory.addProducedModel(M));
        }
    }
}