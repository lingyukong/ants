package com.kly.ants.net.nio_socket;

import java.io.IOException;
import java.nio.channels.SelectionKey;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2020/2/24 11:49
 */
public interface TCPProtocol {

    void handleAccept(SelectionKey key) throws IOException;

    void handleRead(SelectionKey key) throws IOException;

    void handleWrite(SelectionKey key) throws IOException;

}
