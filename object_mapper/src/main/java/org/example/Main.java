package org.example;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import dto.Bear;
import dto.User;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();

        User user = new User();
        user.setName("곰돌이");
        user.setAge(150);

        Bear bear1 = new Bear();
        bear1.setName("북극곰");
        bear1.setBearNumber("1");
        bear1.setType("북극에사는곰");

        Bear bear2 = new Bear();
        bear2.setName("불곰");
        bear2.setBearNumber("2");
        bear2.setType("불나라에 사는 곰");

        List<Bear> bearList = Arrays.asList(bear1, bear2);
        user.setBears(bearList);

        //System.out.println(user);

        String json = objectMapper.writeValueAsString(user);
        System.out.println(json);

        /***************************************************/

        JsonNode jsonNode = objectMapper.readTree(json);
        String _name = jsonNode.get("name").asText();
        int _age = jsonNode.get("age").asInt();
        System.out.println("name : "+_name);
        System.out.println("age : "+_age);


        /* 배열 불러올때 */
        JsonNode bears = jsonNode.get("bears");
        ArrayNode arrayNode = (ArrayNode) bears;
        List<Bear> _bears = objectMapper.convertValue(arrayNode, new TypeReference<List<Bear>>(){});
        System.out.println(_bears);

        /* 값 변경할때 */
        ObjectNode objectNode = (ObjectNode) jsonNode;
        objectNode.put("name", "lee");
        objectNode.put("age", "13");

        System.out.println(objectNode.toPrettyString());

    }
}