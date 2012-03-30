(use '(incanter core stats io charts))

;; regroupement et affichage des histogrammes

(def inputds (read-dataset "test-data.csv" :header true))

;; regroupement par label et calcul des moyennes

(load-file "demo-functions.clj")

(apply-to-groups ($group-by :label inputds) #(:label %) #(view-histogram %) )          

