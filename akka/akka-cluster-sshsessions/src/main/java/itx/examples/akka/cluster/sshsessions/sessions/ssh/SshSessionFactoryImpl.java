package itx.examples.akka.cluster.sshsessions.sessions.ssh;

import itx.examples.akka.cluster.sshsessions.client.SshClientSession;
import itx.examples.akka.cluster.sshsessions.client.SshClientSessionListener;
import itx.examples.akka.cluster.sshsessions.sessions.SshSessionFactory;

/**
 * Created by gergej on 25.3.2017.
 */
public class SshSessionFactoryImpl implements SshSessionFactory {

    @Override
    public SshClientSession createSshSession(String sessionId, SshClientSessionListener sshClientSessionListener) {
        return null;
    }

}
