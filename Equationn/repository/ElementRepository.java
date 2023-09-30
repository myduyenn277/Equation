package Equationn.repository;

import java.util.List;

import Equationn.dataAccess.ElementDao;


    public class ElementRepository implements IElementRepository{
    
    public ElementRepository() {
    }

    @Override
    public List<Float> calculateEquation(float a, float b) {
        return ElementDao.Instance().calculateEquation(a,b);
    }

    @Override
    public List<Float> calculateQuadraticEquation(float a, float b, float c) {
        return ElementDao.Instance().calculateQuadraticEquation(a,b,c);
    }

}
