package com.tinyurl.urlcreation.java;

import com.tinyurl.urlcreation.java.utils.Hashing;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.NoSuchAlgorithmException;

@SpringBootTest
public class HashingTest {

    @InjectMocks
    private Hashing hashing;

    @Test
    public void testHashingBase62() throws NoSuchAlgorithmException {
        Hashing.hasing("https://google.com/india");
    }
}
