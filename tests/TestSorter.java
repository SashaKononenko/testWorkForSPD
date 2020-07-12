

import com.company.kononenko.Sorter;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class TestSorter {

    @Test
    public void testTextInput(){
        Sorter sorter = new Sorter();
        sorter.setText("SPD-University");
        assertEquals( "SPD-University", sorter.getText());
    }

    //This test is not complete and not working correctly
    @Test
    public void testSort(){
        Sorter sorter = new Sorter();
        sorter.setText("SPD-University");
        sorter.sort();
       // boolean result = false;
        Map<Character, Integer> expectedGroupPairedSymbols = new HashMap<>();
        expectedGroupPairedSymbols.put('P',80);
        expectedGroupPairedSymbols.put('R',82);
        expectedGroupPairedSymbols.put('D',68);
        expectedGroupPairedSymbols.put('T',84);
        expectedGroupPairedSymbols.put('V',86);
        expectedGroupPairedSymbols.put('N',78);
        Map<Character, Integer> expectedGroupUnpairedSymbols = new HashMap<>();
        expectedGroupUnpairedSymbols.put('S',83);
        expectedGroupUnpairedSymbols.put('U',85);
        expectedGroupUnpairedSymbols.put('E',69);
        expectedGroupUnpairedSymbols.put('I',73);
        expectedGroupUnpairedSymbols.put('Y',89);
        expectedGroupUnpairedSymbols.put('-',45);
        /*for (Map.Entry symbol:expectedGroupPairedSymbols.entrySet()) {
            if(!sorter.getGroupPairedSymbols().containsKey(symbol.getKey()))
                result = false;
        }*/

        assertTrue(expectedGroupPairedSymbols.equals(sorter.getGroupPairedSymbols()));
        assertTrue(expectedGroupPairedSymbols.equals(sorter.getGroupPairedSymbols()));
    }

}
