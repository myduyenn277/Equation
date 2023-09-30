package Equationn.repository;

import java.util.List;

public interface IElementRepository {
     List<Float> calculateEquation(float a, float b);
      List<Float> calculateQuadraticEquation(float a, float b, float c);
}
