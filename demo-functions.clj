(use '(incanter core stats io charts))

(defn filter-out-errors [data] 
      ($where {:status "true"}  data))

(defn compute-stats [s]
        (zipmap   ["count", "mean", "sd"]
                 [ (count s)  (mean s)  (sd s) ] ))

(defn view-histogram [ds] 
      (view (histogram :t 
      	   :data ds 
	   :title (first ($ :label  ds)) )) )        

(defn apply-to-groups [m kf vf]
    (apply merge
       (map (fn [[k v]] {(kf k) (vf v)})
            m)))


