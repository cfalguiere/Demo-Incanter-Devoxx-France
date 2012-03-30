(use '(incanter core stats io))

;; calcul de la moyenne

(def inputds (read-dataset "test-data.csv" :header true))

(view inputds)

(defn filter-out-errors [data] 
      ($where {:status "true"}  data))

(mean ($ :t (filter-out-errors inputds)) )



