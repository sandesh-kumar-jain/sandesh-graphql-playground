/*
 * Copyright (c) 2021. Dandelion tutorials
 */

package com.example.demo.exception;

public class EntityMappingException extends RuntimeException {

  public EntityMappingException(String message) {
    super(message);
  }

  public EntityMappingException(String message, Throwable cause) {
    super(message, cause);
  }

}
