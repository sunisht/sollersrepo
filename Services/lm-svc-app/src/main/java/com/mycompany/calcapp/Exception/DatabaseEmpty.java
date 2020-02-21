package com.mycompany.calcapp.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND,reason="Database is Empty. "
		+ "No Operations have been performed as of yet.")
public class DatabaseEmpty {

}
