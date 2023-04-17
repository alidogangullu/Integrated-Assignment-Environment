package com.teamfour.iae;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Configuration implements Serializable {
    private String name;
    private String compilerPath;
    private List<String> compilerParameters;
    private List<String> runtimeParameters;
    private String executableName;
    private String mainFileName;

    public Configuration(){

        compilerParameters = new ArrayList<>();

    }

    // GETTERS - SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompilerPath() {
        return compilerPath;
    }

    public void setCompilerPath(String compilerPath) {
        this.compilerPath = compilerPath;
    }

    public List<String> getCompilerParameters() {
        return compilerParameters;
    }

    public void setCompilerParameters(List<String> compilerParameters) {
        this.compilerParameters = compilerParameters;
    }

    public String getExecutableName() {
        return executableName;
    }

    public void setExecutableName(String executableName) {
        this.executableName = executableName;
    }

    public String getMainFileName() {
        return mainFileName;
    }

    public void setMainFileName(String mainFileName) {
        this.mainFileName = mainFileName;
    }


    public List<String> getRuntimeParameters() {
        return runtimeParameters;
    }

    public void setRuntimeParameters(List<String> runtimeParameters) {
        this.runtimeParameters = runtimeParameters;
    }
}
