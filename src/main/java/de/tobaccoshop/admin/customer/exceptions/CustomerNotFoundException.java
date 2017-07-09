package de.tobaccoshop.admin.controllers.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by sebastian on 06.05.16.
 */
@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="Kunde konnte nicht gefunden werden.")
public class CustomerNotFoundException extends RuntimeException {
}
