package abc.def.configs;

import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.utility.DockerImageName;

public class TestMongoContainer extends MongoDBContainer{

    private static TestMongoContainer container;

    private TestMongoContainer() {
        super("mongo:4.0.10");
    }

    public static TestMongoContainer getInstance() {
        if (container == null) {
            container = new TestMongoContainer();
        }
        return container;
    }

    @Override
    public void start() {
        super.start();
        System.setProperty("MONGODB_PORT", String.valueOf(container.getMappedPort(27017)));
    }

    @Override
    public void stop() {
        //do nothing, JVM handles shut down
    }

}