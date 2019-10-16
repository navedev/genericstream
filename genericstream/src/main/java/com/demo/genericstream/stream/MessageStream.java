/**
* Test Copyright Code
*/
package com.demo.genericstream.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface MessageStream {

	String INPUT_CHANNEL = "message_in";

	String OUTPUT_CHANNEL = "message_out";

	/**
	 * Inbound Stream to read Message from a Topic / Queue
	 * 
	 * @return
	 */
	@Input(INPUT_CHANNEL)
	SubscribableChannel inboudMessage();

	/**
	 * Outbound Stream to write Message to a Topic / Queue
	 * 
	 * @return
	 */
	@Output(OUTPUT_CHANNEL)
	MessageChannel outboundMessage();
}
