package ru.netology;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.*;

import java.io.File;
import java.nio.file.Files;

import static org.junit.jupiter.api.Assertions.*;

public class TestJsonParser {
    public JsonParserImpl sut;

    @BeforeEach
    public void init() {
        sut = new JsonParserImpl();
    }

    @Test
    public void testReadString() {
        //given
        String fileName = "data.json", expected = "[{\"firstName\":\"John\",\"lastName\":\"Smith\",\"country\":\"USA\",\"id\":1,\"age\":25},{\"firstName\":\"Inav\",\"lastName\":\"Petrov\",\"country\":\"RU\",\"id\":2,\"age\":23}]";
        //when
        String result = sut.readString(fileName);
        //then
        assertEquals(result, expected);
    }


    @Test
    public void testWriteString() {
        //given
        String fileName = "data.json", str = "[{\"firstName\":\"John\",\"lastName\":\"Smith\",\"country\":\"USA\",\"id\":1,\"age\":25},{\"firstName\":\"Inav\",\"lastName\":\"Petrov\",\"country\":\"RU\",\"id\":2,\"age\":23}]";
        //when
        sut.writeString(fileName, str);
        File result = new File(fileName);
        File expected = new File("data2.json");
        //then
        assertEquals(result.length(), expected.length());
    }
}
