class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {

        HashMap<String, ArrayList<String>> pairs = new HashMap<String, ArrayList<String>>();
        HashMap<String, ArrayList<Double>> valuesPair = new HashMap<String, ArrayList<Double>>();
        for (int i = 0; i < equations.size(); i++) {
           List<String> equation = equations.get(i);
            if (!pairs.containsKey(equation.get(0))) {
                pairs.put(equation.get(0), new ArrayList<String>());
                valuesPair.put(equation.get(0), new ArrayList<Double>());
            }
            if (!pairs.containsKey(equation.get(1))) {
                pairs.put(equation.get(1), new ArrayList<String>());
                valuesPair.put(equation.get(1), new ArrayList<Double>());
            }
            pairs.get(equation.get(0)).add(equation.get(1));
            pairs.get(equation.get(1)).add(equation.get(0));
            valuesPair.get(equation.get(0)).add(values[i]);
            valuesPair.get(equation.get(1)).add(1/values[i]);
        }
        
        double[] result = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
           List<String> query = queries.get(i);
            result[i] = dfs(query.get(0), query.get(1), pairs, valuesPair, new HashSet<String>(), 1.0);
            if (result[i] == 0.0) result[i] = -1.0;
        }
        return result;
    }
    
    private double dfs(String start, String end, HashMap<String, ArrayList<String>> pairs, HashMap<String, ArrayList<Double>> values, HashSet<String> set, double value) {
        if (set.contains(start)) return 0.0;
        if (!pairs.containsKey(start)) return 0.0;
        if (start.equals(end)) return value;
        set.add(start);
        
        ArrayList<String> strList = pairs.get(start);
        ArrayList<Double> valueList = values.get(start);
        double tmp = 0.0;
        for (int i = 0; i < strList.size(); i++) {
            tmp = dfs(strList.get(i), end, pairs, values, set, value*valueList.get(i));
            if (tmp != 0.0) {
                break;
            }
        }
        set.remove(start);
        return tmp;
    }
    }
