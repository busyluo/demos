package language;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class HashMapTest {
	
	//���Դ洢˳��
	@Test
	public void testShunxu() {
		Map<String, Object> map = new HashMap<>();
		
		map.put("1", "a");
		map.put("2", "c");
		map.put("3", "b");
		map.put("4", "d");
		map.put("beijin", "����");
		map.put("ceijin", "����");
		
//		Set entrySet = map.entrySet();
		for (Entry<String, Object> entry : map.entrySet()) {
			
			System.out.println("key="+ entry.getKey() + "   value="+entry.getValue());
			
		}
		
		
	}

}
