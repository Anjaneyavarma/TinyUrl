package com.tinyurl.urlcreation.java.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@Entity
@Table(name = "URL_TABLE")
@AllArgsConstructor
@NoArgsConstructor
public class UrlTable {

    @Id
    private BigInteger id;
    private String shortUrl;
    private String longUrl;
}
