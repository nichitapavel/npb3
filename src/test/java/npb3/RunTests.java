package npb3;

import npb3.BMInOut.BMArgs;
import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class RunTests {
    @Test
    public void testRunBT() {
        BT bt = null;
        try{
            bt = new BT('S', 1, true);
        }catch(OutOfMemoryError e){
            BMArgs.outOfMemoryMessage();
        }
        System.out.println(bt.runULL("http://localhost:5000/message", "JUnit"));
        assertTrue(true);
    }

    @Test
    public void testRunIS() {
        IS is = null;
        try{
            is = new IS('S', 1, true);
        }catch(OutOfMemoryError e){
            BMArgs.outOfMemoryMessage();
        }
        System.out.println(is.runULL("http://localhost:5000/message", "JUnit"));
        assertTrue(true);
    }

    @Test
    public void testRunMG() {
        MG mg = null;
        try{
            mg = new MG('S', 1, true);
        }catch(OutOfMemoryError e){
            BMArgs.outOfMemoryMessage();
        }
        System.out.println(mg.runULL("http://localhost:5000/message", "JUnit"));
        assertTrue(true);
    }

    @Test
    public void testRunCG() {
        CG cg = null;
        try{
            cg = new CG('S', 1, true);
        }catch(OutOfMemoryError e){
            BMArgs.outOfMemoryMessage();
        }
        System.out.println(cg.runULL("http://localhost:5000/message", "JUnit"));
        assertTrue(true);
    }

    @Test
    public void testRunFT() {
        FT ft = null;
        try{
            ft = new FT('S', 1, true);
        }catch(OutOfMemoryError e){
            BMArgs.outOfMemoryMessage();
        }
        System.out.println(ft.runULL("http://localhost:5000/message", "JUnit"));
        assertTrue(true);
    }

    @Test
    public void testRunLU() {
        LU lu = null;
        try{
            lu = new LU('S', 1, true);
        }catch(OutOfMemoryError e){
            BMArgs.outOfMemoryMessage();
            System.exit(0);
        }
        System.out.println(lu.runULL("http://localhost:5000/message", "JUnit"));
        assertTrue(true);
    }

    @Test
    public void testRunSP() {
        SP sp = null;
        try{
            sp = new SP('S', 1, true);
        }catch(OutOfMemoryError e){
            BMArgs.outOfMemoryMessage();
            System.exit(0);
        }
        System.out.println(sp.runULL("http://localhost:5000/message", "JUnit"));
        assertTrue(true);
    }
}

