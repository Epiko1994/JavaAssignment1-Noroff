package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.Character;
import src.Job;

import static org.junit.jupiter.api.Assertions.*;

class JobTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void levelUp() {
        Character testCharacter = new Character();
        Job testJob = new Job();
        testCharacter.setJob(testJob);
        testCharacter.getJob().levelUp();
        assert testCharacter.getJob().getLevel() == 2;
    }
}