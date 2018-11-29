package org.apache.beam.examples;

import org.apache.beam.examples.common.ExampleBigQueryTableOptions;
import org.apache.beam.examples.common.ExampleOptions;
import org.apache.beam.sdk.options.Default;
import org.apache.beam.sdk.options.Description;

public interface SolaceOptions
extends WordCount.WordCountOptions, ExampleOptions, ExampleBigQueryTableOptions {
    @Description("IP and port of the client appliance. (e.g. -cip=192.168.160.101)")
    String getCip();
    void setCip(String value);

    @Description("Client username and optionally VPN name.")
    String getCu();
    void setCu(String value);

    @Description("Client password (default '')")
    @Default.String("")
    String getCp();
    void setCp(String value);

    @Description("List of queues for subscribing")
    String getSql();
    void setSql(String value);

    @Description("Enable auto ack for all GD msgs. (default **client** ack)")
    @Default.Boolean(false)
    boolean getAuto();
    void setAuto(boolean value);

    @Description("The timeout in milliseconds while try to receive a messages from Solace broker")
    @Default.Integer(100)
    int getTimeout();
    void setTimeout(int timeoutInMillis);;
}
