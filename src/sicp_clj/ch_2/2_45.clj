(ns sicp-clj.ch-2.2-45)

(declare beside below)

(defn split [comb split-comb]
  (fn splitter [painter n]
    (if (= n 0) painter
        (let [smaller (splitter painter (- n 1))]
          (comb painter (split-comb smaller smaller))))))

(def right-split (split beside below))
(def up-split (split below beside))
