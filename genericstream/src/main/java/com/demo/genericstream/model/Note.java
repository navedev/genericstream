/**
* Test Copyright Code
*/
package com.demo.genericstream.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class Note {

	private long timestamp;

	private String message;

}
