package serverwofacade;

public class MyFacade {
    private ScheduleServer ss = new ScheduleServer();

    public void startServer() {
        ss.startBooting();
        ss.readSystemConfigFile();
        ss.init();
        ss.initializeContext();
        ss.initializeListeners();
        ss.createSystemObjects();
    }

    public void stopServer() {
        ss.releaseProcesses();
        ss.destory();
        ss.destroySystemObjects();
        ss.destoryListeners();
        ss.destoryContext();
        ss.shutdown();
    }
}
