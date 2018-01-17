package com.criteo.nosql.mewpoke.discovery;

public class Service {
    protected final String serviceName;


    public Service(final String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceName() {
        return serviceName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final String otherServiceName = ((Service) o).serviceName;
        return serviceName == null ? otherServiceName == null : serviceName.equals(otherServiceName);
    }

    @Override
    public int hashCode() {
        return serviceName.hashCode();
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Service {name='")
                .append(serviceName)
                .append("'}")
                .toString();
    }
}
