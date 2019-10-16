/**
* Test Copyright Code
*/
package com.demo.genericstream.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.demo.genericstream.stream.MessageStream;

@EnableBinding(MessageStream.class)
public class MessagingConfig {

}
