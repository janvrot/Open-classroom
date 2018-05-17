class TableCategories < ActiveRecord::Migration[5.0]
  def change
  	create_table :categories
    add_column :categories, :name, :string
  end
end
