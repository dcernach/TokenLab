package net.sozinsoft.tokenlab.test;

import net.sozinsoft.tokenlab.Config;
import net.sozinsoft.tokenlab.D20Token;
import net.sozinsoft.tokenlab.HeroLabD20Digester;
import net.sozinsoft.tokenlab.dtd.Character;
import org.junit.Before;
import org.junit.Test;


import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.prefs.Preferences;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.fail;

public class d20TokenTests {


    HeroLabD20Digester dig;

    @Before
    public void setUp() throws JAXBException {
        dig = new HeroLabD20Digester();
        //dig.parse(new File("src/net/sozinsoft/tokenlab/test/xml/d20Portfolio.xml"));
        dig.parse(new File("src/net/sozinsoft/tokenlab/test/xml/sample.xml"));
    }

    /**
     * @return New Config with mocked out prefs file.
     */
    private Config newConfig() {
        Preferences mockPrefs = Preferences.userNodeForPackage(this.getClass());

        Config config = null;
        try {
            config = new Config(mockPrefs);
        } catch (IOException exception) {
            fail("IO Exception - shouldn't be trying to load the file, however.");
        }
        return config;
    }

    @Test
    public void testBasic() throws Exception {

        List<Character> characters = dig.getCharacters();
        Character dss = characters.get(0);

        D20Token d20tok = new D20Token(dss);
        assertEquals("Rawknar", d20tok.getName());
        //assertEquals(274, d20tok.getClassHitpoints().intValue());
        assertEquals("Human", d20tok.getRace());
        assertEquals("Chaotic Evil", d20tok.getAlignment());
        assertEquals("", d20tok.getDeity());
        assertEquals(16, d20tok.getAge().intValue());
        assertEquals("5'", d20tok.getHeight());
        assertEquals("124lb.", d20tok.getWeight());
        assertEquals(30, d20tok.getSpeed().intValue());
        assertEquals(10, d20tok.getLevel().intValue());
        assertEquals("Bbn 10", d20tok.getClassAbbreviation());
    }

    @Test
    public void testCore() throws Exception {

        List<Character> characters = dig.getCharacters();
        Character dss = characters.get(0);

        D20Token d20tok = new D20Token(dss);
        assertEquals( 90, d20tok.getClassHitpoints().intValue() );
        assertEquals( 10, d20tok.getBaseAttackBonus().intValue());
    }


    @Test
    public void testPathfinderTokenCreation() throws Exception {
        Config config = newConfig();
        config.addConfigEntry( "Rawknar", "src/net/sozinsoft/tokenlab/test/img/Rawknar.png",
                "src/net/sozinsoft/tokenlab/test/img/RawknarPortrait.jpg",
                "src/net/sozinsoft/tokenlab/test/tokens/Rawknar.rptok");

        List<Character> characters = dig.getCharacters();
        for (Character c : characters) {
            dig.saveCharacter(config, c);
        }
    }
}
