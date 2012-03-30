(use '(incanter core stats io charts))

(def inputds (read-dataset "test-data.csv" :header true))

(view inputds)

(defn filter-out-errors [data] 
      ($where {:status "true"}  data))

(defn compute-stats [s]
        (zipmap   ["count", "mean", "sd"]
                 [ (count s)  (mean s)  (sd s) ] ))

;(with-data ($ :t (filter-out-errors inputds))  [ (count $data) (mean $data) ] )
(with-data ($ :t (filter-out-errors inputds))   (compute-stats $data))



