(use '(incanter core stats io charts))

;; affichage de la courbe des temps de réponse

(defn filter-out-errors [data] 
      ($where {:status "true"}  data))

(def inputds (read-dataset "test-data.csv" :header true))

(view (time-series-plot :ts :t :data (filter-out-errors inputds)) )
